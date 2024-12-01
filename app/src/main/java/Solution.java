//suspend fun getResturants(): RestaurantEntity

//val restaurantRepository = RestaurantRepoImpl()
//
//override suspend fun getResturants(): RestaurantEntity {
//    val response = restaurantRepository.getRestaurants()
//
//    return RestaurantEntity("", "")
//
//}


// suspend fun getRestaurants(): DataResponse


//override suspend fun  getRestaurants(): DataResponse
//{
//    Log.v("TAG","Hitint response")
//    delay(15000)
//    val response = ApiInstance.createService(UserService::class.java).getRestaurant()
//    if(response.code()!=200)
//        return DataResponse.Error(message = "Error")
//    return DataResponse.Success(response.body()!!)
//
//}


//
//sealed class DataResponse
//{
//    data class Success(val data:RestaurantModel):DataResponse()
//    data class Error(val message:String):DataResponse()
//
//}

//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//
//class Solution {
//    // Function to return Breadth First Traversal of given graph.
//    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
//
//        Queue<Integer> queue = new LinkedList<Integer>();
//        boolean[] visitedNode = new boolean[adj.size()];
//        queue.add(0);
//        ArrayList<Integer> output = new ArrayList<>();
//
//        while(!queue.isEmpty())
//        {
//            int node = queue.poll();
//
//            ArrayList<Integer> nbrNodes = adj.get(node);
//
//            for(int nbrNode:nbrNodes)
//            {
//                if(!visitedNode[nbrNode])
//                {
//                    queue.add(nbrNode);
//                }
//            }
//
//            output.add(node);
//            visitedNode[node] = true;
//        }
//        return output;
//
//    }
//}
//
//
//
//
//
//
//import RestaurantCardView
//import android.util.Log
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.runtime.getValue
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.lifecycle.compose.collectAsStateWithLifecycle
//import androidx.lifecycle.viewmodel.compose.viewModel
//import com.example.zwiggy.commonui.PrimaryButtonView
//import com.example.zwiggy.dashbaord.widgets.RestaurantCardViewShimmer
//import com.example.zwiggy.dashbaord.widgets.RestaurantListView
//import com.example.feature.ui.theme.ZwiggyTheme
//
//
//@Composable
//fun Dashboard() {
//    val viewModel: DashboardViewModel = viewModel()
//    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
//    when (uiState) {
//        is DashboardUIState.ERROR -> Log.v("TAG","Error")
//        DashboardUIState.IDLE -> PrimaryButtonView(text = "TEST") {
//            Log.v("TAG","Clicked")
//        }
//        DashboardUIState.LOADING -> RestaurantListView({ RestaurantCardViewShimmer() })
//        is DashboardUIState.SUCCESS.Resaturant -> RestaurantListView({ RestaurantCardView() })
//    }
//
//    LaunchedEffect(Unit) {
//        viewModel.getRestauarants()
//    }
//
//}
//
//@Preview(showSystemUi = true)
//@Composable
//fun GetStartedPreview() {
//
//    ZwiggyTheme {
//        Dashboard()
//    }
//}
//
//
//
//
//
//
//
//import com.example.zwiggy.models.RestaurantEntity
//
//
//sealed class DashboardUIState {
//
//    data object  IDLE:DashboardUIState()
//    data object LOADING:DashboardUIState()
//    data class ERROR(val message:String):DashboardUIState()
//    sealed class SUCCESS():DashboardUIState()
//    {
//        data class Resaturant(val data: RestaurantEntity):SUCCESS()
//    }
//
//}
//
//
//
//private val resturantUseCase = ResturantUseCaseImpl()
//private var _uiState = MutableStateFlow<DashboardUIState>(DashboardUIState.IDLE)
//        val uiState: StateFlow<DashboardUIState> = _uiState.asStateFlow()
//
//
//fun getRestauarants()
//{
//    Log.v("TAG","Making Request response")
//    viewModelScope.launch {
//    _uiState.value = DashboardUIState.LOADING
//
//    Log.v("TAG","Making Request2 response")
//    withContext(Dispatchers.IO) {
//        val daata = resturantUseCase.getResturants()
//        Log.v("TAG","Making Request3 response")
//        _uiState.value = DashboardUIState.SUCCESS.Resaturant(daata)
//    }
//
//
//}
//}
//TEX