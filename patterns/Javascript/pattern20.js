const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a number:', (num) => {

    const n = parseInt(num);

    for(let i=1;i<=n;i++){
        var a = "*".repeat(i)
        var b = " ".repeat((n-i)*2)
        var c = "*".repeat(i)
        console.log(a + b + c)
    }
    for(let i=n-1;i>=1;i--){
        var a = "*".repeat(i)
        var b = " ".repeat((n-i)*2)
        var c = "*".repeat(i)
        console.log(a + b + c)
    }

    rl.close();
});