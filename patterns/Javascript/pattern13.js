const readline  = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a number:', (num) => {
    const n = parseInt(num);

    let a=1;
    for(let i=1;i<=n;i++){
        console.log(Array.from({length: i},() => a++).join(' '))
    }

    rl.close();
});