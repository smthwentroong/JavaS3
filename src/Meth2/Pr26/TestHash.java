package Meth2.Pr26;

class Node {
    int Key;
    String value;
    Node next = null;

    Node(int iKey, String value){
        this.Key = iKey;
        this.value = value;
    }

    public void addNext(Node next){
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "Key=" + Key + ": "+ value +
                '}';
    }
}

class HashTable {

    int size;
    int nodes_am;

    Node[] table;

    private Integer hashtabHash(int key){
        return key % nodes_am;
    }

    public void hashtabInit(){
        size = 0;
        nodes_am = 8;
        table = new Node[nodes_am];
    }

    public void hashtabAdd(int key, String value){
        int index = hashtabHash(key);

        size++;
        if (size > nodes_am * 0.75) hashtabResize(nodes_am * 2);

        if (table[index] == null) table[index] = new Node(key,value);
        else {
            Node tmp = table[index];
            while (tmp.next != null) tmp = tmp.next;
            tmp.addNext(new Node(key,value));
        }

    }

    public void hashtabDelete(int key){
        size--;

        int index = hashtabHash(key);

        if(table[index].Key == key ) table[index] = (table[index].next == null)  ? null : table[index].next;
        else if (table[index] != null){
            Node tmp = table[index];
            while (tmp.next != null && tmp.next.Key != key) tmp = tmp.next;
            tmp.next = null;
        }

    }

    public Node hashtabLookUp(int key){
        Node res = table[hashtabHash(key)];
        if (res == null) return null;
        else{
            if (res.Key == key) return res;
            else {
                while (res != null && res.Key != key) res = res.next;
                return res;
            }
        }
    }

    private void hashtabResize(int newSize){
        Node[] newTable = new Node[newSize];

        nodes_am = newSize;

        for(Node elem : table){
            if (elem == null) continue;
            int index = hashtabHash(elem.Key);
            if (newTable[index] == null) newTable[index] = elem;
            else {
                Node tmp = newTable[index];
                while (tmp.next != null) tmp = tmp.next;
                tmp.addNext(elem);
            }
        }

        table = newTable;
    }
}

public class TestHash {
    public static void main(String[] args){
        HashTable tab = new HashTable();
        tab.hashtabInit();
        tab.hashtabAdd(10,"q");
        tab.hashtabAdd(15,"a");
        tab.hashtabAdd(8,"z");
        tab.hashtabAdd(3,"w");
        tab.hashtabAdd(16,"s");
        tab.hashtabAdd(2,"x");
        tab.hashtabAdd(4,"e");
        tab.hashtabAdd(1,"d");
        tab.hashtabAdd(25,"c");
        tab.hashtabAdd(5,"o");
        System.out.println(tab.hashtabLookUp(10));
        tab.hashtabDelete(10);
        System.out.println(tab.hashtabLookUp(10));
    }
}