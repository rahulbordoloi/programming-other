function validateEntries() {
    var name = document.forms["myForm"]["name"].value;
    var email = document.forms["myForm"]["email"].value;
    var msg = document.forms["myForm"]["msg"].value;
    if (name == "" || email == "" || msg == "") {
        alert("These fields cannot be Empty!");
        return false;
    }
    if (email != "" && email.charAt(0) == "@") {
        alert("The E-Mail cannot have a Blank Name!");
        return false;
    }
    if (email != "" && !email.includes("@", 1)) {
        alert("Enter Valid E-Mail !");
        return false;
    }
    alert("Form Submitted Successfully!");
    return true;

}