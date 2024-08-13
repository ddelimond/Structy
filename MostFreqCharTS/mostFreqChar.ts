


function mostFreChar(wrd:string):string{

    let hashMap:{[Key:string]:number} = {};
    let most_frequent :string = '\0';

    for(let letter of wrd){
        if (!(letter in hashMap)){
            hashMap[letter] =0;
        }
        hashMap[letter] +=1;
    }

    for(let letter of  wrd){

        if(most_frequent == '\0' || hashMap[letter] > hashMap[most_frequent]){
            most_frequent = letter;
        }

        if(hashMap[most_frequent] == hashMap[letter]){
            continue;
        }


    }
    return most_frequent;
}

console.log(mostFreChar('potato'));