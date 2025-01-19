const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter the number:', (num) => {
    const n = parseInt(num);

    for (let i = 1; i <= n; i++) {
        var s=(i+"").repeat(i);
        console.log(s);
    }
    rl.close();
});