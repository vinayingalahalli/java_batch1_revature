/**
 * prior to es6 functions were used as constructors before we had classes
 * @param {*} name 
 * @param {*} rating 
 * @param {*} price 
 * @param {*} texture 
 * @param {*} color 
 */
function Food(name, rating, price, texture, color) {
    this.name = name;
    this.rating = rating;
    this.price = price;
    this.texture = texture;
    this.color = color;
}

let rice = new Food('rice', 10, 3, 'grainy', 'white');
console.log(rice);
