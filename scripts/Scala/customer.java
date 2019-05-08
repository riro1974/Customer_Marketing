// ORM class for table 'customer'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 29 20:46:26 PST 2017
// For connector: org.apache.sqoop.manager.DirectMySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class customer extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String cust_no;
  public String get_cust_no() {
    return cust_no;
  }
  public void set_cust_no(String cust_no) {
    this.cust_no = cust_no;
  }
  public customer with_cust_no(String cust_no) {
    this.cust_no = cust_no;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public customer with_title(String title) {
    this.title = title;
    return this;
  }
  private String first_name;
  public String get_first_name() {
    return first_name;
  }
  public void set_first_name(String first_name) {
    this.first_name = first_name;
  }
  public customer with_first_name(String first_name) {
    this.first_name = first_name;
    return this;
  }
  private String last_name;
  public String get_last_name() {
    return last_name;
  }
  public void set_last_name(String last_name) {
    this.last_name = last_name;
  }
  public customer with_last_name(String last_name) {
    this.last_name = last_name;
    return this;
  }
  private String address;
  public String get_address() {
    return address;
  }
  public void set_address(String address) {
    this.address = address;
  }
  public customer with_address(String address) {
    this.address = address;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public customer with_city(String city) {
    this.city = city;
    return this;
  }
  private String state;
  public String get_state() {
    return state;
  }
  public void set_state(String state) {
    this.state = state;
  }
  public customer with_state(String state) {
    this.state = state;
    return this;
  }
  private String zip;
  public String get_zip() {
    return zip;
  }
  public void set_zip(String zip) {
    this.zip = zip;
  }
  public customer with_zip(String zip) {
    this.zip = zip;
    return this;
  }
  private String country;
  public String get_country() {
    return country;
  }
  public void set_country(String country) {
    this.country = country;
  }
  public customer with_country(String country) {
    this.country = country;
    return this;
  }
  private String gender;
  public String get_gender() {
    return gender;
  }
  public void set_gender(String gender) {
    this.gender = gender;
  }
  public customer with_gender(String gender) {
    this.gender = gender;
    return this;
  }
  private String email;
  public String get_email() {
    return email;
  }
  public void set_email(String email) {
    this.email = email;
  }
  public customer with_email(String email) {
    this.email = email;
    return this;
  }
  private String username;
  public String get_username() {
    return username;
  }
  public void set_username(String username) {
    this.username = username;
  }
  public customer with_username(String username) {
    this.username = username;
    return this;
  }
  private String password;
  public String get_password() {
    return password;
  }
  public void set_password(String password) {
    this.password = password;
  }
  public customer with_password(String password) {
    this.password = password;
    return this;
  }
  private String phn;
  public String get_phn() {
    return phn;
  }
  public void set_phn(String phn) {
    this.phn = phn;
  }
  public customer with_phn(String phn) {
    this.phn = phn;
    return this;
  }
  private String dob;
  public String get_dob() {
    return dob;
  }
  public void set_dob(String dob) {
    this.dob = dob;
  }
  public customer with_dob(String dob) {
    this.dob = dob;
    return this;
  }
  private String age;
  public String get_age() {
    return age;
  }
  public void set_age(String age) {
    this.age = age;
  }
  public customer with_age(String age) {
    this.age = age;
    return this;
  }
  private String cc_type;
  public String get_cc_type() {
    return cc_type;
  }
  public void set_cc_type(String cc_type) {
    this.cc_type = cc_type;
  }
  public customer with_cc_type(String cc_type) {
    this.cc_type = cc_type;
    return this;
  }
  private Integer cc_nbr;
  public Integer get_cc_nbr() {
    return cc_nbr;
  }
  public void set_cc_nbr(Integer cc_nbr) {
    this.cc_nbr = cc_nbr;
  }
  public customer with_cc_nbr(Integer cc_nbr) {
    this.cc_nbr = cc_nbr;
    return this;
  }
  private Integer cvv2;
  public Integer get_cvv2() {
    return cvv2;
  }
  public void set_cvv2(Integer cvv2) {
    this.cvv2 = cvv2;
  }
  public customer with_cvv2(Integer cvv2) {
    this.cvv2 = cvv2;
    return this;
  }
  private String cc_expires;
  public String get_cc_expires() {
    return cc_expires;
  }
  public void set_cc_expires(String cc_expires) {
    this.cc_expires = cc_expires;
  }
  public customer with_cc_expires(String cc_expires) {
    this.cc_expires = cc_expires;
    return this;
  }
  private String guid;
  public String get_guid() {
    return guid;
  }
  public void set_guid(String guid) {
    this.guid = guid;
  }
  public customer with_guid(String guid) {
    this.guid = guid;
    return this;
  }
  private String latitude;
  public String get_latitude() {
    return latitude;
  }
  public void set_latitude(String latitude) {
    this.latitude = latitude;
  }
  public customer with_latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }
  private String longitude;
  public String get_longitude() {
    return longitude;
  }
  public void set_longitude(String longitude) {
    this.longitude = longitude;
  }
  public customer with_longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }
  private String browser_user_agent;
  public String get_browser_user_agent() {
    return browser_user_agent;
  }
  public void set_browser_user_agent(String browser_user_agent) {
    this.browser_user_agent = browser_user_agent;
  }
  public customer with_browser_user_agent(String browser_user_agent) {
    this.browser_user_agent = browser_user_agent;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof customer)) {
      return false;
    }
    customer that = (customer) o;
    boolean equal = true;
    equal = equal && (this.cust_no == null ? that.cust_no == null : this.cust_no.equals(that.cust_no));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.first_name == null ? that.first_name == null : this.first_name.equals(that.first_name));
    equal = equal && (this.last_name == null ? that.last_name == null : this.last_name.equals(that.last_name));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.zip == null ? that.zip == null : this.zip.equals(that.zip));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.gender == null ? that.gender == null : this.gender.equals(that.gender));
    equal = equal && (this.email == null ? that.email == null : this.email.equals(that.email));
    equal = equal && (this.username == null ? that.username == null : this.username.equals(that.username));
    equal = equal && (this.password == null ? that.password == null : this.password.equals(that.password));
    equal = equal && (this.phn == null ? that.phn == null : this.phn.equals(that.phn));
    equal = equal && (this.dob == null ? that.dob == null : this.dob.equals(that.dob));
    equal = equal && (this.age == null ? that.age == null : this.age.equals(that.age));
    equal = equal && (this.cc_type == null ? that.cc_type == null : this.cc_type.equals(that.cc_type));
    equal = equal && (this.cc_nbr == null ? that.cc_nbr == null : this.cc_nbr.equals(that.cc_nbr));
    equal = equal && (this.cvv2 == null ? that.cvv2 == null : this.cvv2.equals(that.cvv2));
    equal = equal && (this.cc_expires == null ? that.cc_expires == null : this.cc_expires.equals(that.cc_expires));
    equal = equal && (this.guid == null ? that.guid == null : this.guid.equals(that.guid));
    equal = equal && (this.latitude == null ? that.latitude == null : this.latitude.equals(that.latitude));
    equal = equal && (this.longitude == null ? that.longitude == null : this.longitude.equals(that.longitude));
    equal = equal && (this.browser_user_agent == null ? that.browser_user_agent == null : this.browser_user_agent.equals(that.browser_user_agent));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof customer)) {
      return false;
    }
    customer that = (customer) o;
    boolean equal = true;
    equal = equal && (this.cust_no == null ? that.cust_no == null : this.cust_no.equals(that.cust_no));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.first_name == null ? that.first_name == null : this.first_name.equals(that.first_name));
    equal = equal && (this.last_name == null ? that.last_name == null : this.last_name.equals(that.last_name));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.zip == null ? that.zip == null : this.zip.equals(that.zip));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.gender == null ? that.gender == null : this.gender.equals(that.gender));
    equal = equal && (this.email == null ? that.email == null : this.email.equals(that.email));
    equal = equal && (this.username == null ? that.username == null : this.username.equals(that.username));
    equal = equal && (this.password == null ? that.password == null : this.password.equals(that.password));
    equal = equal && (this.phn == null ? that.phn == null : this.phn.equals(that.phn));
    equal = equal && (this.dob == null ? that.dob == null : this.dob.equals(that.dob));
    equal = equal && (this.age == null ? that.age == null : this.age.equals(that.age));
    equal = equal && (this.cc_type == null ? that.cc_type == null : this.cc_type.equals(that.cc_type));
    equal = equal && (this.cc_nbr == null ? that.cc_nbr == null : this.cc_nbr.equals(that.cc_nbr));
    equal = equal && (this.cvv2 == null ? that.cvv2 == null : this.cvv2.equals(that.cvv2));
    equal = equal && (this.cc_expires == null ? that.cc_expires == null : this.cc_expires.equals(that.cc_expires));
    equal = equal && (this.guid == null ? that.guid == null : this.guid.equals(that.guid));
    equal = equal && (this.latitude == null ? that.latitude == null : this.latitude.equals(that.latitude));
    equal = equal && (this.longitude == null ? that.longitude == null : this.longitude.equals(that.longitude));
    equal = equal && (this.browser_user_agent == null ? that.browser_user_agent == null : this.browser_user_agent.equals(that.browser_user_agent));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.cust_no = JdbcWritableBridge.readString(1, __dbResults);
    this.title = JdbcWritableBridge.readString(2, __dbResults);
    this.first_name = JdbcWritableBridge.readString(3, __dbResults);
    this.last_name = JdbcWritableBridge.readString(4, __dbResults);
    this.address = JdbcWritableBridge.readString(5, __dbResults);
    this.city = JdbcWritableBridge.readString(6, __dbResults);
    this.state = JdbcWritableBridge.readString(7, __dbResults);
    this.zip = JdbcWritableBridge.readString(8, __dbResults);
    this.country = JdbcWritableBridge.readString(9, __dbResults);
    this.gender = JdbcWritableBridge.readString(10, __dbResults);
    this.email = JdbcWritableBridge.readString(11, __dbResults);
    this.username = JdbcWritableBridge.readString(12, __dbResults);
    this.password = JdbcWritableBridge.readString(13, __dbResults);
    this.phn = JdbcWritableBridge.readString(14, __dbResults);
    this.dob = JdbcWritableBridge.readString(15, __dbResults);
    this.age = JdbcWritableBridge.readString(16, __dbResults);
    this.cc_type = JdbcWritableBridge.readString(17, __dbResults);
    this.cc_nbr = JdbcWritableBridge.readInteger(18, __dbResults);
    this.cvv2 = JdbcWritableBridge.readInteger(19, __dbResults);
    this.cc_expires = JdbcWritableBridge.readString(20, __dbResults);
    this.guid = JdbcWritableBridge.readString(21, __dbResults);
    this.latitude = JdbcWritableBridge.readString(22, __dbResults);
    this.longitude = JdbcWritableBridge.readString(23, __dbResults);
    this.browser_user_agent = JdbcWritableBridge.readString(24, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.cust_no = JdbcWritableBridge.readString(1, __dbResults);
    this.title = JdbcWritableBridge.readString(2, __dbResults);
    this.first_name = JdbcWritableBridge.readString(3, __dbResults);
    this.last_name = JdbcWritableBridge.readString(4, __dbResults);
    this.address = JdbcWritableBridge.readString(5, __dbResults);
    this.city = JdbcWritableBridge.readString(6, __dbResults);
    this.state = JdbcWritableBridge.readString(7, __dbResults);
    this.zip = JdbcWritableBridge.readString(8, __dbResults);
    this.country = JdbcWritableBridge.readString(9, __dbResults);
    this.gender = JdbcWritableBridge.readString(10, __dbResults);
    this.email = JdbcWritableBridge.readString(11, __dbResults);
    this.username = JdbcWritableBridge.readString(12, __dbResults);
    this.password = JdbcWritableBridge.readString(13, __dbResults);
    this.phn = JdbcWritableBridge.readString(14, __dbResults);
    this.dob = JdbcWritableBridge.readString(15, __dbResults);
    this.age = JdbcWritableBridge.readString(16, __dbResults);
    this.cc_type = JdbcWritableBridge.readString(17, __dbResults);
    this.cc_nbr = JdbcWritableBridge.readInteger(18, __dbResults);
    this.cvv2 = JdbcWritableBridge.readInteger(19, __dbResults);
    this.cc_expires = JdbcWritableBridge.readString(20, __dbResults);
    this.guid = JdbcWritableBridge.readString(21, __dbResults);
    this.latitude = JdbcWritableBridge.readString(22, __dbResults);
    this.longitude = JdbcWritableBridge.readString(23, __dbResults);
    this.browser_user_agent = JdbcWritableBridge.readString(24, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(cust_no, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(title, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(first_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(last_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(zip, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(gender, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(email, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(username, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(password, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(phn, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dob, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(age, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cc_type, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(cc_nbr, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cvv2, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(cc_expires, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(guid, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(latitude, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(longitude, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(browser_user_agent, 24 + __off, 12, __dbStmt);
    return 24;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(cust_no, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(title, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(first_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(last_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(zip, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(gender, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(email, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(username, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(password, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(phn, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dob, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(age, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cc_type, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(cc_nbr, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cvv2, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(cc_expires, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(guid, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(latitude, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(longitude, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(browser_user_agent, 24 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.cust_no = null;
    } else {
    this.cust_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.first_name = null;
    } else {
    this.first_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.last_name = null;
    } else {
    this.last_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.address = null;
    } else {
    this.address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.state = null;
    } else {
    this.state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.zip = null;
    } else {
    this.zip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.country = null;
    } else {
    this.country = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.gender = null;
    } else {
    this.gender = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.email = null;
    } else {
    this.email = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.username = null;
    } else {
    this.username = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.password = null;
    } else {
    this.password = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.phn = null;
    } else {
    this.phn = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dob = null;
    } else {
    this.dob = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.age = null;
    } else {
    this.age = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cc_type = null;
    } else {
    this.cc_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cc_nbr = null;
    } else {
    this.cc_nbr = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cvv2 = null;
    } else {
    this.cvv2 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cc_expires = null;
    } else {
    this.cc_expires = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.guid = null;
    } else {
    this.guid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.latitude = null;
    } else {
    this.latitude = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.longitude = null;
    } else {
    this.longitude = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.browser_user_agent = null;
    } else {
    this.browser_user_agent = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.cust_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cust_no);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.first_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_name);
    }
    if (null == this.last_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_name);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.zip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zip);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, gender);
    }
    if (null == this.email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, email);
    }
    if (null == this.username) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, username);
    }
    if (null == this.password) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, password);
    }
    if (null == this.phn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, phn);
    }
    if (null == this.dob) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dob);
    }
    if (null == this.age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, age);
    }
    if (null == this.cc_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cc_type);
    }
    if (null == this.cc_nbr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cc_nbr);
    }
    if (null == this.cvv2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cvv2);
    }
    if (null == this.cc_expires) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cc_expires);
    }
    if (null == this.guid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, guid);
    }
    if (null == this.latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, latitude);
    }
    if (null == this.longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, longitude);
    }
    if (null == this.browser_user_agent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, browser_user_agent);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.cust_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cust_no);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.first_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_name);
    }
    if (null == this.last_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_name);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.zip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zip);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, gender);
    }
    if (null == this.email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, email);
    }
    if (null == this.username) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, username);
    }
    if (null == this.password) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, password);
    }
    if (null == this.phn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, phn);
    }
    if (null == this.dob) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dob);
    }
    if (null == this.age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, age);
    }
    if (null == this.cc_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cc_type);
    }
    if (null == this.cc_nbr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cc_nbr);
    }
    if (null == this.cvv2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cvv2);
    }
    if (null == this.cc_expires) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cc_expires);
    }
    if (null == this.guid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, guid);
    }
    if (null == this.latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, latitude);
    }
    if (null == this.longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, longitude);
    }
    if (null == this.browser_user_agent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, browser_user_agent);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(cust_no==null?"null":cust_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_name==null?"null":first_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_name==null?"null":last_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address==null?"null":address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zip==null?"null":zip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gender==null?"null":gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(email==null?"null":email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(username==null?"null":username, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(password==null?"null":password, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(phn==null?"null":phn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dob==null?"null":dob, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(age==null?"null":age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cc_type==null?"null":cc_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cc_nbr==null?"null":"" + cc_nbr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cvv2==null?"null":"" + cvv2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cc_expires==null?"null":cc_expires, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(guid==null?"null":guid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latitude==null?"null":latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longitude==null?"null":longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(browser_user_agent==null?"null":browser_user_agent, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(cust_no==null?"null":cust_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_name==null?"null":first_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_name==null?"null":last_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address==null?"null":address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zip==null?"null":zip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gender==null?"null":gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(email==null?"null":email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(username==null?"null":username, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(password==null?"null":password, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(phn==null?"null":phn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dob==null?"null":dob, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(age==null?"null":age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cc_type==null?"null":cc_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cc_nbr==null?"null":"" + cc_nbr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cvv2==null?"null":"" + cvv2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cc_expires==null?"null":cc_expires, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(guid==null?"null":guid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latitude==null?"null":latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longitude==null?"null":longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(browser_user_agent==null?"null":browser_user_agent, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cust_no = null; } else {
      this.cust_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.first_name = null; } else {
      this.first_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.last_name = null; } else {
      this.last_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.zip = null; } else {
      this.zip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.gender = null; } else {
      this.gender = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.email = null; } else {
      this.email = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.username = null; } else {
      this.username = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.password = null; } else {
      this.password = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.phn = null; } else {
      this.phn = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.dob = null; } else {
      this.dob = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.age = null; } else {
      this.age = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cc_type = null; } else {
      this.cc_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cc_nbr = null; } else {
      this.cc_nbr = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cvv2 = null; } else {
      this.cvv2 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cc_expires = null; } else {
      this.cc_expires = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.guid = null; } else {
      this.guid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.latitude = null; } else {
      this.latitude = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.longitude = null; } else {
      this.longitude = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.browser_user_agent = null; } else {
      this.browser_user_agent = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cust_no = null; } else {
      this.cust_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.first_name = null; } else {
      this.first_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.last_name = null; } else {
      this.last_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.zip = null; } else {
      this.zip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.gender = null; } else {
      this.gender = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.email = null; } else {
      this.email = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.username = null; } else {
      this.username = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.password = null; } else {
      this.password = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.phn = null; } else {
      this.phn = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.dob = null; } else {
      this.dob = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.age = null; } else {
      this.age = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cc_type = null; } else {
      this.cc_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cc_nbr = null; } else {
      this.cc_nbr = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cvv2 = null; } else {
      this.cvv2 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cc_expires = null; } else {
      this.cc_expires = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.guid = null; } else {
      this.guid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.latitude = null; } else {
      this.latitude = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.longitude = null; } else {
      this.longitude = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.browser_user_agent = null; } else {
      this.browser_user_agent = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    customer o = (customer) super.clone();
    return o;
  }

  public void clone0(customer o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("cust_no", this.cust_no);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("first_name", this.first_name);
    __sqoop$field_map.put("last_name", this.last_name);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("zip", this.zip);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("gender", this.gender);
    __sqoop$field_map.put("email", this.email);
    __sqoop$field_map.put("username", this.username);
    __sqoop$field_map.put("password", this.password);
    __sqoop$field_map.put("phn", this.phn);
    __sqoop$field_map.put("dob", this.dob);
    __sqoop$field_map.put("age", this.age);
    __sqoop$field_map.put("cc_type", this.cc_type);
    __sqoop$field_map.put("cc_nbr", this.cc_nbr);
    __sqoop$field_map.put("cvv2", this.cvv2);
    __sqoop$field_map.put("cc_expires", this.cc_expires);
    __sqoop$field_map.put("guid", this.guid);
    __sqoop$field_map.put("latitude", this.latitude);
    __sqoop$field_map.put("longitude", this.longitude);
    __sqoop$field_map.put("browser_user_agent", this.browser_user_agent);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("cust_no", this.cust_no);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("first_name", this.first_name);
    __sqoop$field_map.put("last_name", this.last_name);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("zip", this.zip);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("gender", this.gender);
    __sqoop$field_map.put("email", this.email);
    __sqoop$field_map.put("username", this.username);
    __sqoop$field_map.put("password", this.password);
    __sqoop$field_map.put("phn", this.phn);
    __sqoop$field_map.put("dob", this.dob);
    __sqoop$field_map.put("age", this.age);
    __sqoop$field_map.put("cc_type", this.cc_type);
    __sqoop$field_map.put("cc_nbr", this.cc_nbr);
    __sqoop$field_map.put("cvv2", this.cvv2);
    __sqoop$field_map.put("cc_expires", this.cc_expires);
    __sqoop$field_map.put("guid", this.guid);
    __sqoop$field_map.put("latitude", this.latitude);
    __sqoop$field_map.put("longitude", this.longitude);
    __sqoop$field_map.put("browser_user_agent", this.browser_user_agent);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("cust_no".equals(__fieldName)) {
      this.cust_no = (String) __fieldVal;
    }
    else    if ("title".equals(__fieldName)) {
      this.title = (String) __fieldVal;
    }
    else    if ("first_name".equals(__fieldName)) {
      this.first_name = (String) __fieldVal;
    }
    else    if ("last_name".equals(__fieldName)) {
      this.last_name = (String) __fieldVal;
    }
    else    if ("address".equals(__fieldName)) {
      this.address = (String) __fieldVal;
    }
    else    if ("city".equals(__fieldName)) {
      this.city = (String) __fieldVal;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
    }
    else    if ("zip".equals(__fieldName)) {
      this.zip = (String) __fieldVal;
    }
    else    if ("country".equals(__fieldName)) {
      this.country = (String) __fieldVal;
    }
    else    if ("gender".equals(__fieldName)) {
      this.gender = (String) __fieldVal;
    }
    else    if ("email".equals(__fieldName)) {
      this.email = (String) __fieldVal;
    }
    else    if ("username".equals(__fieldName)) {
      this.username = (String) __fieldVal;
    }
    else    if ("password".equals(__fieldName)) {
      this.password = (String) __fieldVal;
    }
    else    if ("phn".equals(__fieldName)) {
      this.phn = (String) __fieldVal;
    }
    else    if ("dob".equals(__fieldName)) {
      this.dob = (String) __fieldVal;
    }
    else    if ("age".equals(__fieldName)) {
      this.age = (String) __fieldVal;
    }
    else    if ("cc_type".equals(__fieldName)) {
      this.cc_type = (String) __fieldVal;
    }
    else    if ("cc_nbr".equals(__fieldName)) {
      this.cc_nbr = (Integer) __fieldVal;
    }
    else    if ("cvv2".equals(__fieldName)) {
      this.cvv2 = (Integer) __fieldVal;
    }
    else    if ("cc_expires".equals(__fieldName)) {
      this.cc_expires = (String) __fieldVal;
    }
    else    if ("guid".equals(__fieldName)) {
      this.guid = (String) __fieldVal;
    }
    else    if ("latitude".equals(__fieldName)) {
      this.latitude = (String) __fieldVal;
    }
    else    if ("longitude".equals(__fieldName)) {
      this.longitude = (String) __fieldVal;
    }
    else    if ("browser_user_agent".equals(__fieldName)) {
      this.browser_user_agent = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("cust_no".equals(__fieldName)) {
      this.cust_no = (String) __fieldVal;
      return true;
    }
    else    if ("title".equals(__fieldName)) {
      this.title = (String) __fieldVal;
      return true;
    }
    else    if ("first_name".equals(__fieldName)) {
      this.first_name = (String) __fieldVal;
      return true;
    }
    else    if ("last_name".equals(__fieldName)) {
      this.last_name = (String) __fieldVal;
      return true;
    }
    else    if ("address".equals(__fieldName)) {
      this.address = (String) __fieldVal;
      return true;
    }
    else    if ("city".equals(__fieldName)) {
      this.city = (String) __fieldVal;
      return true;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
      return true;
    }
    else    if ("zip".equals(__fieldName)) {
      this.zip = (String) __fieldVal;
      return true;
    }
    else    if ("country".equals(__fieldName)) {
      this.country = (String) __fieldVal;
      return true;
    }
    else    if ("gender".equals(__fieldName)) {
      this.gender = (String) __fieldVal;
      return true;
    }
    else    if ("email".equals(__fieldName)) {
      this.email = (String) __fieldVal;
      return true;
    }
    else    if ("username".equals(__fieldName)) {
      this.username = (String) __fieldVal;
      return true;
    }
    else    if ("password".equals(__fieldName)) {
      this.password = (String) __fieldVal;
      return true;
    }
    else    if ("phn".equals(__fieldName)) {
      this.phn = (String) __fieldVal;
      return true;
    }
    else    if ("dob".equals(__fieldName)) {
      this.dob = (String) __fieldVal;
      return true;
    }
    else    if ("age".equals(__fieldName)) {
      this.age = (String) __fieldVal;
      return true;
    }
    else    if ("cc_type".equals(__fieldName)) {
      this.cc_type = (String) __fieldVal;
      return true;
    }
    else    if ("cc_nbr".equals(__fieldName)) {
      this.cc_nbr = (Integer) __fieldVal;
      return true;
    }
    else    if ("cvv2".equals(__fieldName)) {
      this.cvv2 = (Integer) __fieldVal;
      return true;
    }
    else    if ("cc_expires".equals(__fieldName)) {
      this.cc_expires = (String) __fieldVal;
      return true;
    }
    else    if ("guid".equals(__fieldName)) {
      this.guid = (String) __fieldVal;
      return true;
    }
    else    if ("latitude".equals(__fieldName)) {
      this.latitude = (String) __fieldVal;
      return true;
    }
    else    if ("longitude".equals(__fieldName)) {
      this.longitude = (String) __fieldVal;
      return true;
    }
    else    if ("browser_user_agent".equals(__fieldName)) {
      this.browser_user_agent = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
