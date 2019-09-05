// this is object literal notation, we can create whatever object we want with 
// whatever fields we want
let laptop = {
    price: 500,
    brand: 'hp',
    batteryLife: 4,
    processor: {
        brand: 'Intel',
        cores: 4,
        model: 'i7 7700u',
    }
}

console.log(laptop);
console.log(`processor name: ${laptop.processor.brand}`);

// we can also dynamically add fields
// but we probably shouldn't
laptop.screenSize = 15.9;
console.log(laptop);