package br.com.credilink.rangeUtil;

import com.github.jgonian.ipmath.Ipv4;
import com.github.jgonian.ipmath.Ipv4Range;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class TesteRange {
    @Test
    @DisplayName("Verifica se o ip esta no range")
    public void isIpInRange(){
        String input1 = "10.1.1.1";
        Ipv4 ipv41 = Ipv4.parse(input1);
        Ipv4Range range = Ipv4Range.parse("10.1.1.1/32");
        assertTrue(range.contains(ipv41));

    }
    @Test
    @DisplayName("Verifica se o ip esta fora do range")
    public void isOutOfRange(){
        String input1 = "192.169.0.1";
        Ipv4 ipv41 = Ipv4.parse(input1);
        Ipv4Range range = Ipv4Range.parse("10.1.1.1/32");
        assertFalse(range.contains(ipv41));

    }
}
