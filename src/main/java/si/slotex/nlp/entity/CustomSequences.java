package si.slotex.nlp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Model which is used for sequncing numbers in the MongoDB entity table.
 * For each new entity it generates a ID which has the value previusEntityID + 1
 *
 * @author Mitja Kotnik
 * @version 1.0
 */
@Document(collection = "customSequences")
public class CustomSequences
{

    @Id
    private String id;
    private Long seq;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Long getSeq()
    {
        return seq;
    }

    public void setSeq(Long seq)
    {
        this.seq = seq;
    }
}
