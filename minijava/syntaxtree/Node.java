//
// Generated by JTB 1.3.2
//

package minijava.syntaxtree;

/**
 * The interface which all syntax tree classes must implement.
 */
public interface Node extends java.io.Serializable {
   public void accept(minijava.visitor.Visitor v);
   public <R,A> R accept(minijava.visitor.GJVisitor<R,A> v, A argu);
   public <R> R accept(minijava.visitor.GJNoArguVisitor<R> v);
   public <A> void accept(minijava.visitor.GJVoidVisitor<A> v, A argu);
}

