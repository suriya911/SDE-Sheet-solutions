const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a number:', (num) => {
    const n = parseInt(num);

    for (let i=n;i>0;i--){
        var a=" ".repeat(n-i);
        var b = "*".repeat(i*2-1);
        console.log(a+b+a);
    }
    rl.close();
});