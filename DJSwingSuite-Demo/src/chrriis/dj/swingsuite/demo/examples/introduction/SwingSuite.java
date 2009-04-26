/*
 * Christopher Deckers (chrriis@nextencia.net)
 * http://www.nextencia.net
 *
 * See the file "readme.txt" for information on usage and redistribution of
 * this file, and for a DISCLAIMER OF ALL WARRANTIES.
 */
package chrriis.dj.swingsuite.demo.examples.introduction;

import java.awt.BorderLayout;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * @author Christopher Deckers
 */
public class SwingSuite extends JPanel {

  protected static final String LS = System.getProperty("line.separator");

  public SwingSuite() {
    super(new BorderLayout(0, 0));
    JEditorPane editorPane = new JEditorPane("text/html",
        "<html>" + LS +
        "  <body>" + LS +
        "    <h1>Why DJ Swing Suite?</h1>" + LS +
        "    <p>Swing is a powerful user-interface toolkit. It offers many components that one can customize in various ways.</p>" + LS +
        "    <p>The problem is that after developping Swing applications for a while, we all find certain limitations and we keep re-inventing the wheel.</p>" + LS +
        "    <h1>A better wheel?</h1>" + LS +
        "    <p>Most of the time, we end up coding those components for the immediate task at hand: certain components have hundreds of variations but no general purpose API.</p>" + LS +
        "    <p>This project aims at creating such re-usable general purpose components to simplify the development of rich Swing user interfaces.</p>" + LS +
        "  </body>" + LS +
        "</html");
    editorPane.setEditable(false);
    add(new JScrollPane(editorPane));
  }

}
