const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a number:', (num) => {
    const n = parseInt(num);

    for(let i=n;i>0;i--){
        var s = "*".repeat(i);
        console.log(s);
    }
    rl.close();
});