package at.esque.kafka.topics;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import org.apache.kafka.common.header.Header;

public class KafkaMessage {

    private LongProperty offset = new SimpleLongProperty();
    private IntegerProperty partition = new SimpleIntegerProperty();
    private StringProperty key = new SimpleStringProperty();
    private StringProperty value = new SimpleStringProperty();
    private StringProperty timestamp = new SimpleStringProperty();
    private ListProperty<Header> headers = new SimpleListProperty<>();
    private StringProperty keyType = new SimpleStringProperty();
    private StringProperty valueType = new SimpleStringProperty();
    private IntegerProperty serializedKeySize = new SimpleIntegerProperty();
    private IntegerProperty serializedValueSize = new SimpleIntegerProperty();
    private StringProperty valueSchemaId = new SimpleStringProperty();

    public long getOffset() {
        return offset.get();
    }

    public LongProperty offsetProperty() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset.set(offset);
    }

    public int getPartition() {
        return partition.get();
    }

    public IntegerProperty partitionProperty() {
        return partition;
    }

    public void setPartition(int partition) {
        this.partition.set(partition);
    }

    public String getKey() {
        return key.get();
    }

    public StringProperty keyProperty() {
        return key;
    }

    public void setKey(String key) {
        this.key.set(key);
    }

    public String getValue() {
        return value.get();
    }

    public StringProperty valueProperty() {
        return value;
    }

    public void setValue(String value) {
        this.value.set(value);
    }

    public String getTimestamp() {
        return timestamp.get();
    }

    public StringProperty timestampProperty() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp.set(timestamp);
    }

    public ObservableList<Header> getHeaders() {
        return headers.get();
    }

    public ListProperty<Header> headersProperty() {
        return headers;
    }

    public void setHeaders(ObservableList<Header> headers) {
        this.headers.set(headers);
    }

    public String getKeyType() {
        return keyType.get();
    }

    public StringProperty keyTypeProperty() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType.set(keyType);
    }

    public String getValueType() {
        return valueType.get();
    }

    public StringProperty valueTypeProperty() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType.set(valueType);
    }

    public void setSerializedKeySize(int serializedKeySize) {
        this.serializedKeySize.set(serializedKeySize);
    }

    public void setSerializedValueSize(int serializedValueSize)
    {
        this.serializedValueSize.set(serializedValueSize);
    }

    public IntegerProperty serializedKeySizeProperty() { return serializedKeySize;}
    public IntegerProperty serializedValueSizeProperty() { return serializedValueSize;}

    public int getSerializedKeySize(){
        return this.serializedKeySize.get();
    }

    public int getSerializedValueSize() {
        return this.serializedValueSize.get();
    }

    public void setValueSchemaId(String valueSchemaId)
    {
        this.valueSchemaId.set(valueSchemaId);
    }

    public StringProperty valueSchemaIdProperty() { return valueSchemaId;}

    public String getValueSchemaId() { return this.valueSchemaId.get();}

}
