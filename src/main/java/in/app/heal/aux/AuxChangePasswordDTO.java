package in.app.heal.aux;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuxChangePasswordDTO {
  private String email;
  private String currentPassword;
  private String password;
}
