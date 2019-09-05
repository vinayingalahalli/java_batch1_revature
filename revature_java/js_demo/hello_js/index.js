console.log("Hello Console")
//document.write("<h1>Hello from External JS</h1>");


function hello() {
    var fname = document.getElementById("fname");
    // document.write("<h1>Hello "+fname.value+"</h1>");
    document.getElementById("msg").innerHTML = "<b>Hello " + fname.value + "</b>";
}

function validate() {
    let fname = document.getElementById("fname").value;
    let msg = document.getElementById("msg");
    if (fname.length == 0) {
        msg.style.color = "red";
        msg.innerText = "Invalid Name"
        return false;
    } else {
        msg.style.color = "green";
        msg.innerText = "Hello " + fname;
        return false;
    }
}