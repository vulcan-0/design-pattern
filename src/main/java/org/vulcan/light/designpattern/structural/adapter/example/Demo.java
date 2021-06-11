package org.vulcan.light.designpattern.structural.adapter.example;

import java.util.Collection;
import java.util.Enumeration;

/**
 * 适配器模式示例
 *
 * @author Sam Lu
 * @date 2021/6/11
 * @see java.util.Arrays#asList(Object[])
 * @see java.util.Collections#list(Enumeration)
 * @see java.util.Collections#enumeration(Collection)
 * @see java.io.InputStreamReader(java.io.InputStream) （返回Reader对象）
 * @see java.io.OutputStreamWriter(java.io.OutputStream) （返回Writer对象）
 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(Object)
 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(Object)
 */
public class Demo {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }

}
