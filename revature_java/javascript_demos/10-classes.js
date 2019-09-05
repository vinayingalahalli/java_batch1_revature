class Food {
    constructor(texture, rating, name, color, price) {
        this.texture = texture;
        this.rating = rating;
        this.name = name;
        this.color = color;
        this.price = price;

        this.otherGetColor = () => {
            return this.color;
        }
    }

    getColor() {
        return this.color;
    }
}
let banana = new Food('smoothe', 5, 'banana', 'green', 10);
console.log(banana);

console.log(`getColor() = ${banana.getColor()}
otherGetColor() = ${banana.otherGetColor()}`)
