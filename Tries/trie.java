public class trie {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("applet");
        trie.insert("appliance");

        System.out.println(trie.search("applet"));
    }
}

class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean flag;
    
    public TrieNode() {
        flag = false;
        for(int i=0; i<26; i++) {
            children[i] = null;
        }
    }
}


class Trie{
    TrieNode root;
    
    public Trie(){
        root = new TrieNode();
    }
    
    public void insert(String word){
        TrieNode node = root;
        
        for(char c : word.toCharArray() ) {
            
            int index = c-'a';
            if(node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.flag = true;
    }

    public boolean search(String word) {
        TrieNode node = root;

        for(char c : word.toCharArray()){
            int index = c-'a';
            if(node.children[index] == null){
                return false;
            }
            node = node.children[index];
        }

        return node.flag; //true
    }
    // public boolean startWith(String word, String[] res) {
    //     TrieNode node = root;

    //     for(char c : word.toCharArray()){
    //         int index = c-'a';
    //         if(node.children.flag == true ){
    //             return res.add()
    //         }
    //         node = node.children[index];
    //     }

    //     return res; //true
    // }
}

