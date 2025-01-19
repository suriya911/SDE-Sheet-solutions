const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a number:', (num) => {

    const n = parseInt(num);

    for(let i=-n+1;i<n;i++){
        console.log([...Array(2*n-1)].map((_,j) => Math.max(Math.abs(i),Math.abs(j-n+1))+1).join(""));
    }

    rl.close();
});