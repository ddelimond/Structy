

const anagram = (word1:string, word2:string):boolean =>{

    let count: {[key:string]:number} = {};

    for(let letter of word1){

        if(!(letter in count)){
            count[letter] = 0;
        }

        count[letter]+=1;
    }

    for(let letter of word2){
        if(!(letter in count)){
            return false;
        }
        else{
            count[letter]-=1;
        }
    }

    for(let letter in count){
        if(count[letter] !== 0){
            return false;
        }

    }

    return true;

}


console.log(anagram('cat', 'tac'));
