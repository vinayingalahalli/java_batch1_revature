
function createInterval(message) {
    
    setInterval(() => {
        console.log(message);
        message += message;
    }, 5000)

}

createInterval('hello');
createInterval('today is wednesday');


setTimeout(() => {
    console.log('you are now blocked');
    let date = new Date();
    let time = date.getTime();
    while(true) {
        if(time + 25000  < (new Date()).getTime()) {
            break;
        }
    }
    console.log('unblocked');
}, 15000)