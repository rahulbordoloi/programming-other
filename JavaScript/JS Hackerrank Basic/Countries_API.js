'use strict';

const fs = require('fs');
const https = require('https');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}


function fetch(url) {
    return new Promise((resolve, reject) => {
        https
            .get(url, (res) => {
                let result = '';
                res.on('data', (chunk) => {
                    result += chunk;
                });
                res.on('end', () => {
                    resolve(JSON.parse(result));
                });
            })
            .on('error', (error) => {
                reject(error);
            });
    });
}
async function getCountryName(code) {
    // write your code here
    // API endpoint: https://jsonmock.hackerrank.com/api/countries?page=<PAGE_NUMBER>
    const { total_pages, data } = await fetch(
        `https://jsonmock.hackerrank.com/api/countries?page=1`
    );
    const answer = findInCountries(data, code);
    if (answer) return answer.name;

    for (let i = 2; i <= total_pages; i++) {
        const { data } = await fetch(
            `https://jsonmock.hackerrank.com/api/countries?page=${i}`
        );
        const answer = findInCountries(data, code, i);
        if (answer) return answer.name;
    }
}

function findInCountries(countries, code, i = 1) {
    return countries.find((c) => c['alpha2Code'] === code);
}

async function main() {
  const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

  const code = readLine().trim();

  const name = await getCountryName(code);

  ws.write(`${name}\n`);

}
