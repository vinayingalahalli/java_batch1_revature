function isValidUser(){
	let b=false;
	let message="";
	const userName=document.getElementsByName("userName")[0].value;
	const password=document.getElementsByName("password")[0].value;
	if(userName=="" || password=="" ||userName.length==0 || password.length==0 ){
		message="Username/Password cannot be empty"
	}/*else if(){
		message="Invalid Username/Password
	} code here for regex*/
	
	if(message.length==0){
		b=true;
	}
	
	document.getElementById("errMessage").innerText=message;
	return b;
}