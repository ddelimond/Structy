

// test case
// 2c3a1t

let uncompress = (wrd:string):void  => {
    let start:number = 0;
    let end:number = 0;
    let numbers:string = '0123456789'
    let resultStr:string = '';

    for(end; end < wrd.length; end++){

        if(!numbers.includes(wrd.charAt(end))){
           const letter:string = wrd[end];
           const num:number = Number.parseInt(wrd.slice(start, end));
           resultStr += letter.repeat(num);
            end++;
           start = end;
        }
    }

    return console.log(resultStr);
}

uncompress('2c3a11t');