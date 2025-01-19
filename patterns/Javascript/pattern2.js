const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter a number: ", (input) => {
    const n = parseInt(input);
    for (let i = 1; i <= n; i++) {
        var s="*".repeat(i);
        console.log(s);
    }
    rl.close();
});
