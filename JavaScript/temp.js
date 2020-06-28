// var myName = prompt("What's your Name?");

// //console.log(myName)

// alert("My Name is " + myName + "!!!");

//alert(prompt("Enter your Tweet: ").slice(0,140));

//Slicing
/*
var x = prompt("Enter your Name");
x = x.slice(0,1).toUpperCase() + x.slice(1, x.length);
alert("Your Name is " + x + " !");
*/

//BMI Calculator
/*
var x = prompt("Enter your Weight")
var y = prompt("Enter your Height")
bmi = x/(y*y)
alert("Your BMI is " + bmi)
*/

// Leap Year
/*
var x = prompt("Enter The Year")
if(x%4 === 0 && x%100 !== 0 || x%400 == 0){
    alert("It's a Leap Year!")
    }
    else{
        alert("It's not a Leap Year!")
    }
*/

// Arrays

/*var guestList = ['Rahul', 'Rony', 'R07']
var x = prompt("Enter your Name")
if(guestList.includes(x)){
    alert("You're Welcomed")
}
else{
    alert("Umm..I'm Sorry, can't find your invitation")
}*/

/*
function whosPaying(names){
    var numOfPeople = names.length;
    var randomPersonPos = Math.floor(Math.random() * numberOfPeople)
    var randomPerson = names[randomPersonPos]
    return randomPerson + " is going to buy lunch Today!"
}
*/

//fibonacci series

function fib(n){
    var op=[];
    if(n===1){
        op=[0]
    }
    else if(n===2){
        op=[0,1]
    }
    else{
        op=[0,1]
        for(var i=2;i<n;i++){
            op.push(op[op.length-2] + op[op.length-1])
        }
    }
    console.log(op)
}

fib(5)
