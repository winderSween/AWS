import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class FriendItemMain {
    public static void main(String[] args) {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();

        DynamoDBMapper mapper = new DynamoDBMapper(client);

        FriendItem friendItem = new FriendItem();
        friendItem.setName("Alan");

        friendItem = mapper.load(friendItem);

        System.out.println("[Object] Age is: " + friendItem.getAge());
    }

}
