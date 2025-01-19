const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a number:', (num) => {

    const n = parseInt(num);

    for(let i=1;i<=n;i++){
        var a = " ".repeat(n-i);
        var b = Array.from({length: i}, (_,j) => String.fromCharCode(64+j+1)).join('');
        var c = Array.from({length: i-1}, (_,j) => String.fromCharCode(64+j+1)).reverse().join('');
        console.log(a+b+c);
    }

    rl.close();
});