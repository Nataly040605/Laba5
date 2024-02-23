package data;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Objects;

public class Organization {
	static Integer newId = 0;
	private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private final String name; //Поле не может быть null, Строка не может быть пустой
    private final Coordinates coordinates; //Поле не может быть null
    private final java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private final long annualTurnover; //Значение поля должно быть больше 0
    private final OrganizationType type; //Поле не может быть null
    private final Address postalAddress; //Поле не может быть null
    
	public Organization(String name, Coordinates coordinates, long annualTurnover, OrganizationType type, Address postalAddress) {
		  newId += 1;
		  this.id = newId;
		  this.name = name;
		  this.coordinates = coordinates;
		  this.creationDate = java.time.LocalDateTime.now();
		  this.annualTurnover = annualTurnover;
		  this.type = type;
		  this.postalAddress = postalAddress;
		}

		@Override
		public String toString() {
		  return "Organization{" +
		          "id=" + id +
		          ", name='" + name + '\'' +
		          ", coordinates=" + coordinates +
		          ", creationDate=" + creationDate +
		          ", annualTurnover=" + annualTurnover +
		          ", type=" + type +
		          ", postalAddress=" + postalAddress +
		          '}';
		}

		public boolean equalsByType(OrganizationType type) {
		  return type.equals(this.type);
		}
		
		@Override
		public boolean equals(Object o) {
		  if (this == o) return true;
		  if (o == null || getClass() != o.getClass()) return false;
		  Organization organization = (Organization) o;
		  return id == organization.id && Double.compare(Objects.equals(name, organization.name) && Objects.equals(coordinates, organization.coordinates) && Objects.equals(creationDate, organization.creationDate) && Objects.equals(annualTurnover, organization.annualTurnover) && type == organization.type && Objects.equals(postalAddress, organization.postalAddress);
		}

		@Override
		public int hashCode() {
		  return Objects.hash(id, name, coordinates, creationDate, annualTurnover, type, postalAddress);
		}

		@Override
		public int compareTo(Organization o) {
		  int res = this.name.compareTo(o.name);
		  if (res == 0) {
		      res = this.coordinates.compareTo(o.coordinates);
		      if (res == 0) {
		          res = this.creationDate.compareTo(o.creationDate);
		          if (res == 0) {
		              res = this.annualTurnover.compareTo(o.annualTurnover);
		              if (res == 0) {
		                  res = this.postalAddress.compareTo(o.postalAddress);
		              }
		          }
		      }
		  }
		  return res;
		}
		
		public String getName() {
		  return name;
		}
		
		public Coordinates getCoordinates() {
		  return coordinates;
		}
		
		public LocalDateTime getCreationDate() {
		  return creationDate;
		}
		
		public long getAnnualTurnover() {
		  return annualTurnover;
		}
		
		public OrganizationType getType() {
		  return type;
		}
		
		public Address getPostalAddress() {
		  return postalAddress;
		}
		
		public Integer getId() {
		  return id;
		}
		
		public void setId() {
		  try {
		      this.id = SecureRandom.getInstanceStrong().nextInteger(); // Уникальный != случайный
		  } catch (java.security.NoSuchAlgorithmException e) {
		      System.out.println("No such algorithm");
		  }
		}
}
