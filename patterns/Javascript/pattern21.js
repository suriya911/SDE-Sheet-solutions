const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a number:', (num) => {

    const n = parseInt(num);

    for(let i=1;i<=n;i++){
        if (i==1 || i==n){
            console.log("*".repeat(n));
        }
        else{
            console.log("*" + " ".repeat(n-2) + "*");
        }
    }

    rl.close();
});