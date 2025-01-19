const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function rangeascn(n){
    return [...Array(n).keys()].map(i => i+1).join("");
    // return Array.from({length:n}, (_,i) => i+1);
}

function rangedesc(n){
    return [...Array(n).keys()].map(i=> n-i).join("");
}
rl.question('Enter a number:', (num) => {
    const n = parseInt(num);

    for(let i=1;i<=n;i++){
        var r = rangeascn(i)+" ".repeat((n-i)*2)+rangedesc(i);
        console.log(r);
    }
    rl.close();
});