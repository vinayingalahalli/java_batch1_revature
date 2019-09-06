function getGitUsers() {

    let xhr = new XMLHttpRequest;

    xhr.open('GET', 'https://api.github.com/users', true);

    xhr.onload = function () {
        if (this.readyState == 4 && this.status == 200) {
            //console.log(JSON.parse(this.responseText))
            let git = JSON.parse(this.responseText);
            console.log(git);
            var data = "<table><tr><th>Username</th><th>Avatar</th></tr>";
            git.forEach(element => {
                // console.log(element.login);
                data = data + "<tr><td>" + element.login+"</td>" ;
                data=data+"<td><img height=100 width=100 src='"+element.avatar_url+"'/></td></tr>";
            });
            data = data + "</table>"
            document.getElementById("data").innerHTML = data;
        }
    }
    xhr.send();

}


function getUserById(){
    let xhr = new XMLHttpRequest;
    let id=document.getElementById("userid").value;
    let url='https://api.github.com/users/'+id;
    xhr.open('GET', url, true);

    xhr.onload = function () {
        if (this.readyState == 4 && this.status == 200) {
            //console.log(JSON.parse(this.responseText))
            let git = JSON.parse(this.responseText);
            console.log(git);
            var data = "<table><tr><th>Username</th><th>Avatar</th></tr>";
           // git.forEach(element => {
                // console.log(element.login);
                data = data + "<tr><td>" + git.name+"</td>" ;
                data=data+"<td><img height=100 width=100 src='"+git.avatar_url+"'/></td></tr>";
            //});
            data = data + "</table>"
            document.getElementById("data").innerHTML = data;
        }
    }
    xhr.send();
}


