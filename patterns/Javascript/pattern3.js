const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function printRange(n) {
    console.log([...Array(n).keys()].map(i => i + 1).join(""));
}

rl.question('Enter the number:', (num) => {
    const n = parseInt(num);

    for (let i = 1; i <= n; i++) {
        printRange(i);
    }
    rl.close();
});