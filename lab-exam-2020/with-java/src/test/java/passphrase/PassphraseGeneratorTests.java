package passphrase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class PassphraseGeneratorTests {

    private final List<String> lowers;
    private final List<String> uppers;
    private final List<String> numbers;

    PassphraseGeneratorTests() {
        this.lowers = Arrays.asList("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z".split(","));
        this.uppers = Arrays.asList("A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z".split(","));
        this.numbers = Arrays.asList("1,2,3,4,5,6,7,8,9,0".split(","));
    }

    @Test
    void generataPassphraseNotContainUppers() {
        PassphraseGenerator passphraseGenerator = new PassphraseGenerator(true,false,true);
        for (int i=1; i<=10000; i++ ) {
            String passphrase = passphraseGenerator.generate(1024);
            assert passphrase.equals(passphrase.toLowerCase());
        }
    }

    @Test
    void generatePassphraseBySpecifiedLength(){
        int length = 10;
        PassphraseGenerator passphraseGenerator = new PassphraseGenerator(true, true, true);
        String passphrase = passphraseGenerator.generate(length);
        assert passphrase.length() == 10;
    }

    @Test
    void generateEmptyWhenAllConfigIsFalse(){
        PassphraseGenerator passphraseGenerator = new PassphraseGenerator(false, false,false);
        String passphrase = passphraseGenerator.generate(10);
        assertEquals("", passphrase);
    }
}
