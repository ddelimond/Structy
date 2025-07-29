


class myArray<T>{
    arr:T[];

    constructor(initial:T[] =[]){
        this.arr = [...initial];
    }
    insert(value:T){
        this.arr.push(value);
    }

    mirror():T[] {
        return this.arr;
    }
}


export default myArray