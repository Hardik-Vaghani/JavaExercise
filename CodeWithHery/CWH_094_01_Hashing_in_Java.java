package CodeWithHery;
public class CWH_094_01_Hashing_in_Java {
}
/*
Hashing is the technique to convert the range of key-value pairs to a range of indices. In hashing, we use hash functions to map keys to some values.

Example :
Let arr=[11,33,22,14]

hashIndex = (key %10)


Collision: The hash function may map two key values to a single index. Such a situation is known as a collision.

Example : Let 1l=[22,42,64,71]

H(x) = keys%10


In the above image, you can see that the 22 and 44 are mapped to the index number 2. Therefore we need to avoid the collision. Following techniques are used to avoid collision in hashing :

Open addressing
Chaining
 */