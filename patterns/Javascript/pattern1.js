const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter a number: ", (input) => {
    const n = parseInt(input);
    for (let i = 0; i < n; i++) {
        var s="*".repeat(n);
        console.log(s);
    }
    rl.close();
});
