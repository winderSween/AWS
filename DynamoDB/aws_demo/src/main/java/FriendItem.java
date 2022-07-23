import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable (tableName = FriendItem.FRIEND_TABLE_NAME)
public class FriendItem {

    static final String FRIEND_TABLE_NAME = "Friends";
    private static final String HASH_KEY = "Name";
    private static final String ATTRIBUTE_AGE = "Age";

    @DynamoDBHashKey(attributeName = HASH_KEY)
    private String name;

    @DynamoDBAttribute(attributeName = ATTRIBUTE_AGE)
    private int age;

}
