const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a number:', (num) => {

    const n = parseInt(num);

    for(let i=1;i<=n;i++){
        var s = Array.from({length: i}, (_,j) => String.fromCharCode(64+n-j)).reverse().join(' ');
        console.log(s);
    }

    rl.close();
});