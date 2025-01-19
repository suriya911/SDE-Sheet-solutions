const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a number:', (num) => {
    const n = parseInt(num);

    for(let i=1;i<=n;i++){
        console.log(
            Array.from({length:i}, (_,j) => (i%2==j%2)? "0":"1").join(" ")
        );
    }
    rl.close();
});