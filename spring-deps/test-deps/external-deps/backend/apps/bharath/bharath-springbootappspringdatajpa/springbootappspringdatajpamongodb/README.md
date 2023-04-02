
```
pushkarchauhan91@pushkarchauhan91s-MacBook-Air ~ % mongosh
test> show dbs;
admin     41 kB
config  61.4 kB
local   77.8 kB
test      41 kB
test> use test;
already on db test
test> show collections;
product
test> db.product.find().pretty();
[
  {
    _id: ObjectId("614dc05d2f7371365f9785e8"),
    name: 'IPhone',
    price: 1000,
    _class: 'com.bharath.mongodb.model.Product'
  }
]
```