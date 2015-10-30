package TO;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Model.Veiculo;
import TO.VeiculoTO;

public class ListarVeiculoTO extends ArrayList <VeiculoTO>{
	
	private static final long serialVersionUID = 1L;
	
	public String toJSON(){
		JSONArray v = new JSONArray();
	//	Locale local = new Locale("pt","BR");
	//	DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT, local);
		for(VeiculoTO to:this){
			JSONObject obj = new JSONObject();
			try {
				obj.put("codAcessorio",to.codAcessorio);
				obj.put("codMarca", to.codMarca);
				obj.put("modelo", to.modelo);
				obj.put("grupo", to.grupo);
				obj.put("kmControlado", to.kmControlado);
				obj.put("tarifaKmLivre", to.tarifaKmLivre);
				obj.put("acessorio", to.acessorio);
				obj.put("kmRodado", to.kmRodado);
				obj.put("estado", to.estado);
				obj.put("cidade", to.cidade);
				obj.put("fabricante", to.fabricante);
				obj.put("placa", to.placa);
				obj.put("chassi", to.chassi);
				v.put(obj);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return v.toString();	
	}
	
}
