const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a number:', (num) => {

    const n = parseInt(num);

    for(let i=n;i>0;i--){
        console.log(
            Array.from({length: i}, (_,j) => String.fromCharCode(64+j+1)).join('')
        );
    }

    rl.close();
});