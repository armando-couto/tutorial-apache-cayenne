package br.jus.tjce.cayenne.TutorialCayenne.persistence.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import br.jus.tjce.cayenne.TutorialCayenne.persistence.Pintura;

/**
 * Class _Galeria was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Galeria extends CayenneDataObject {

	private static final long serialVersionUID = -6516203295311109105L;
	public static final String NOME_PROPERTY = "nome";
    public static final String RELACAO_PINTURA_PROPERTY = "relacaoPintura";

    public static final String ID_PK_COLUMN = "id";

    public void setNome(String nome) {
        writeProperty("nome", nome);
    }
    public String getNome() {
        return (String)readProperty("nome");
    }

    public void addToRelacaoPintura(Pintura obj) {
        addToManyTarget("relacaoPintura", obj, true);
    }
    public void removeFromRelacaoPintura(Pintura obj) {
        removeToManyTarget("relacaoPintura", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Pintura> getRelacaoPintura() {
        return (List<Pintura>)readProperty("relacaoPintura");
    }


}