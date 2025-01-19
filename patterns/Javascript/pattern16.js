const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a number:', (num) => {

    const n = parseInt(num);

    for(let i=1;i<=n;i++){
        console.log(
            String.fromCharCode(64+i).repeat(i)
        );
    }

    rl.close();
});