
function Person(name) {
    this.getName = () => {
        return name;
    }

    this.setName = (newName) => {
        name = newName;
    }
    
}

let me = new Person('Blake');