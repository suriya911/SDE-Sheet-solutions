const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function printRange(n) {
    console.log([...Array(n).keys()].map(i=>i+1).join(""));
}

rl.question('Enter a number:', (num) => {
    const n = parseInt(num);

    for(let i=n;i>0;i--){
        printRange(i);
    }
    rl.close();
});