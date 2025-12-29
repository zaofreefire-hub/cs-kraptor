import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.TvType

class FaselHDProvider : MainAPI() {
    override var name = "FaselHD"
    override var mainUrl = "https://faselhd.com"
    override var lang = "ar"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    override suspend fun search(query: String): List<SearchResponse> {
        return emptyList()
    }
}
