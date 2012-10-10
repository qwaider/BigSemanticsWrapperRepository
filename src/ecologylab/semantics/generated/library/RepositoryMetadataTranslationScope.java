package ecologylab.semantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import java.util.List;
import java.util.Map;

public class RepositoryMetadataTranslationScope
{

	protected static final Class TRANSLATIONS[] =
	{
		crit.semantics.generated.txtf1.fieldreports.emergent_event.EmergentEvent.class,

		crit.semantics.generated.txtf1.fieldreports.emergent_event.EmergentEventCollection.class,

		crit.semantics.generated.txtf1.fieldreports.spotrep.Spotrep.class,

		ecologylab.semantics.generated.library.Bookmark.class,

		ecologylab.semantics.generated.library.DeliciousHomepage.class,

		ecologylab.semantics.generated.library.PdfMixin.class,

		ecologylab.semantics.generated.library.PubmedArticle.class,

		ecologylab.semantics.generated.library.WeatherReport.class,

		ecologylab.semantics.generated.library.acm.AcmPortal.class,

		ecologylab.semantics.generated.library.acm.AcmPortalAuthor.class,

		ecologylab.semantics.generated.library.acm.AcmPortalAuthorCollaborators.class,

		ecologylab.semantics.generated.library.acm.AcmPortalAuthorPublicationDetail.class,

		ecologylab.semantics.generated.library.acm.AcmPortalInstitutionProfile.class,

		ecologylab.semantics.generated.library.acm.AcmPortalPeriodical.class,

		ecologylab.semantics.generated.library.acm.AcmPortalSearch.class,

		ecologylab.semantics.generated.library.acm.AcmPortalSearchResult.class,

		ecologylab.semantics.generated.library.artwork.Artist.class,

		ecologylab.semantics.generated.library.artwork.Artwork.class,

		ecologylab.semantics.generated.library.artwork.MmArtwork.class,

		ecologylab.semantics.generated.library.artwork.MomaArtwork.class,

		ecologylab.semantics.generated.library.artwork.TempFieldValueHolder.class,

		ecologylab.semantics.generated.library.bibManaging.CitationInfo.class,

		ecologylab.semantics.generated.library.bibManaging.CiteseerxRecord.class,

		ecologylab.semantics.generated.library.bibManaging.CiteseerxSearch.class,

		ecologylab.semantics.generated.library.bibManaging.CiteseerxSearchResult.class,

		ecologylab.semantics.generated.library.bibManaging.CiteseerxSummary.class,

		ecologylab.semantics.generated.library.blog.Blog.class,

		ecologylab.semantics.generated.library.blog.Post.class,

		ecologylab.semantics.generated.library.buzz.GoogleTrends.class,

		ecologylab.semantics.generated.library.buzz.HotSearch.class,

		ecologylab.semantics.generated.library.camera.CameraSettings.class,

		ecologylab.semantics.generated.library.cartoon.BritishCartoonArchive.class,

		ecologylab.semantics.generated.library.cartoon.Cartoon.class,

		ecologylab.semantics.generated.library.cartoon.GaurdianComic.class,

		ecologylab.semantics.generated.library.cartoon.GlobeCartoon.class,

		ecologylab.semantics.generated.library.cartoon.PoliticalCartoon.class,

		ecologylab.semantics.generated.library.cartoon.SfuCartoonArchive.class,

		ecologylab.semantics.generated.library.cartoon.TrumanLibrary1948CampaignCartoons.class,

		ecologylab.semantics.generated.library.citeulike.CiteulikeAuthor.class,

		ecologylab.semantics.generated.library.citeulike.CiteulikePaper.class,

		ecologylab.semantics.generated.library.citeulike.CiteulikeSearch.class,

		ecologylab.semantics.generated.library.citeulike.CiteulikeTag.class,

		ecologylab.semantics.generated.library.citeulike.CiteulikeUser.class,

		ecologylab.semantics.generated.library.creative_work.Author.class,

		ecologylab.semantics.generated.library.creative_work.BasicPublication.class,

		ecologylab.semantics.generated.library.creative_work.CreativeWork.class,

		ecologylab.semantics.generated.library.creative_work.Periodical.class,

		ecologylab.semantics.generated.library.dlese.AdditionalMetadata.class,

		ecologylab.semantics.generated.library.dlese.Audience.class,

		ecologylab.semantics.generated.library.dlese.Collection.class,

		ecologylab.semantics.generated.library.dlese.Contributor.class,

		ecologylab.semantics.generated.library.dlese.DateInfo.class,

		ecologylab.semantics.generated.library.dlese.DleseGetRecord.class,

		ecologylab.semantics.generated.library.dlese.DleseRecord.class,

		ecologylab.semantics.generated.library.dlese.DleseRecord1.class,

		ecologylab.semantics.generated.library.dlese.DleseRecord2.class,

		ecologylab.semantics.generated.library.dlese.DleseRecordHead.class,

		ecologylab.semantics.generated.library.dlese.DleseUserSearch.class,

		ecologylab.semantics.generated.library.dlese.Educational.class,

		ecologylab.semantics.generated.library.dlese.General.class,

		ecologylab.semantics.generated.library.dlese.GetRecordAdditionalMetadata.class,

		ecologylab.semantics.generated.library.dlese.Head1.class,

		ecologylab.semantics.generated.library.dlese.Head2.class,

		ecologylab.semantics.generated.library.dlese.ItemRecord.class,

		ecologylab.semantics.generated.library.dlese.Lifecycle.class,

		ecologylab.semantics.generated.library.dlese.Organization.class,

		ecologylab.semantics.generated.library.dlese.RecordMetaMetadata.class,

		ecologylab.semantics.generated.library.dlese.RecordMetadata.class,

		ecologylab.semantics.generated.library.dlese.ResultInfo.class,

		ecologylab.semantics.generated.library.dlese.SearchAdditionalMetadataAdn.class,

		ecologylab.semantics.generated.library.dlese.SearchSection.class,

		ecologylab.semantics.generated.library.dlese.UserSearchAdditionalMetadata.class,

		ecologylab.semantics.generated.library.fastflip.FastflipSearch.class,

		ecologylab.semantics.generated.library.fastflip.Thumbnail.class,

		ecologylab.semantics.generated.library.flickr.FlickrAuthor.class,

		ecologylab.semantics.generated.library.flickr.FlickrPhoto.class,

		ecologylab.semantics.generated.library.flickr.FlickrTag.class,

		ecologylab.semantics.generated.library.flickr.Photostream.class,

		ecologylab.semantics.generated.library.gis.ContactPoint.class,

		ecologylab.semantics.generated.library.gis.GisLocation.class,

		ecologylab.semantics.generated.library.gis.PostalAddress.class,

		ecologylab.semantics.generated.library.googleBook.GoogleBook.class,

		ecologylab.semantics.generated.library.googleBook.Page.class,

		ecologylab.semantics.generated.library.grant.Grant.class,

		ecologylab.semantics.generated.library.grant.GrantProgram.class,

		ecologylab.semantics.generated.library.grant.GrantStaff.class,

		ecologylab.semantics.generated.library.grant.Investigator.class,

		ecologylab.semantics.generated.library.hotel.Hotel.class,

		ecologylab.semantics.generated.library.icdl.IcdlBook.class,

		ecologylab.semantics.generated.library.icdl.IcdlBookPreview.class,

		ecologylab.semantics.generated.library.icdl.IcdlImageResult.class,

		ecologylab.semantics.generated.library.lolz.Lolz.class,

		ecologylab.semantics.generated.library.misc.Comment.class,

		ecologylab.semantics.generated.library.misc.DcDocument.class,

		ecologylab.semantics.generated.library.misc.Dlms.class,

		ecologylab.semantics.generated.library.misc.IcdlImage.class,

		ecologylab.semantics.generated.library.misc.Nsdl.class,

		ecologylab.semantics.generated.library.misc.Rating.class,

		ecologylab.semantics.generated.library.misc.Review.class,

		ecologylab.semantics.generated.library.movie.Actor.class,

		ecologylab.semantics.generated.library.movie.Movie.class,

		ecologylab.semantics.generated.library.nsdl.Header.class,

		ecologylab.semantics.generated.library.nsdl.NsdlDocument.class,

		ecologylab.semantics.generated.library.nsdl.NsdlService.class,

		ecologylab.semantics.generated.library.nsdl.SearchResults.class,

		ecologylab.semantics.generated.library.nsf.NsfAward.class,

		ecologylab.semantics.generated.library.nsf.NsfDivision.class,

		ecologylab.semantics.generated.library.nsf.NsfDivisionStaffList.class,

		ecologylab.semantics.generated.library.nsf.NsfInvestigator.class,

		ecologylab.semantics.generated.library.nsf.NsfProgram.class,

		ecologylab.semantics.generated.library.nsf.NsfProgramStaffList.class,

		ecologylab.semantics.generated.library.nsf.NsfSearch.class,

		ecologylab.semantics.generated.library.nsf.NsfStaff.class,

		ecologylab.semantics.generated.library.opml.Body.class,

		ecologylab.semantics.generated.library.opml.Head.class,

		ecologylab.semantics.generated.library.opml.Opml.class,

		ecologylab.semantics.generated.library.opml.Outline.class,

		ecologylab.semantics.generated.library.patent.GooglePatent.class,

		ecologylab.semantics.generated.library.patent.GoogleSorry.class,

		ecologylab.semantics.generated.library.patent.Patent.class,

		ecologylab.semantics.generated.library.patent.PatentAuthor.class,

		ecologylab.semantics.generated.library.patent.PatentClassification.class,

		ecologylab.semantics.generated.library.person.BirthDetail.class,

		ecologylab.semantics.generated.library.person.Person.class,

		ecologylab.semantics.generated.library.product_and_service.AmazonList.class,

		ecologylab.semantics.generated.library.product_and_service.AmazonProduct.class,

		ecologylab.semantics.generated.library.product_and_service.Commodity.class,

		ecologylab.semantics.generated.library.product_and_service.Product.class,

		ecologylab.semantics.generated.library.product_and_service.Service.class,

		ecologylab.semantics.generated.library.publication.AmazonBook.class,

		ecologylab.semantics.generated.library.publication.Book.class,

		ecologylab.semantics.generated.library.publication.Publication.class,

		ecologylab.semantics.generated.library.publication.Publisher.class,

		ecologylab.semantics.generated.library.publication.Subject.class,

		ecologylab.semantics.generated.library.publication.TermType.class,

		ecologylab.semantics.generated.library.restaurant.Restaurant.class,

		ecologylab.semantics.generated.library.restaurant.RestaurantGenre.class,

		ecologylab.semantics.generated.library.rich_bookmark.MobileRichBookmark.class,

		ecologylab.semantics.generated.library.rich_bookmark.MobileRichBookmarkCollection.class,

		ecologylab.semantics.generated.library.rss.Channel.class,

		ecologylab.semantics.generated.library.rss.Dc.class,

		ecologylab.semantics.generated.library.rss.Item.class,

		ecologylab.semantics.generated.library.rss.MediaContent.class,

		ecologylab.semantics.generated.library.rss.Rss.class,

		ecologylab.semantics.generated.library.rss.Rss22.class,

		ecologylab.semantics.generated.library.rss.YahooMediaRss.class,

		ecologylab.semantics.generated.library.rwandatribunal.CategoryInterviews.class,

		ecologylab.semantics.generated.library.rwandatribunal.PersonnelInterview.class,

		ecologylab.semantics.generated.library.rwandatribunal.TribunalVoices.class,

		ecologylab.semantics.generated.library.rwandatribunal.VideoInterview.class,

		ecologylab.semantics.generated.library.scholarlyArticle.InformaWorld.class,

		ecologylab.semantics.generated.library.scholarlyArticle.ScholarlyArticle.class,

		ecologylab.semantics.generated.library.scienceDirect.ScienceDirectArticle.class,

		ecologylab.semantics.generated.library.search.BingSearchApi.class,

		ecologylab.semantics.generated.library.search.DeliciousSearch.class,

		ecologylab.semantics.generated.library.search.GoogleScholarSearch.class,

		ecologylab.semantics.generated.library.search.GoogleScholarSearchResult.class,

		ecologylab.semantics.generated.library.search.ImageSearch.class,

		ecologylab.semantics.generated.library.search.ImageSearchResult.class,

		ecologylab.semantics.generated.library.search.Search.class,

		ecologylab.semantics.generated.library.search.SearchCrumb.class,

		ecologylab.semantics.generated.library.search.SearchMeta.class,

		ecologylab.semantics.generated.library.search.SlashdotSearch.class,

		ecologylab.semantics.generated.library.search.SocialMediaSearch1.class,

		ecologylab.semantics.generated.library.search.SocialMediaSearch2.class,

		ecologylab.semantics.generated.library.search.SocialMediaSearchResult.class,

		ecologylab.semantics.generated.library.search.TumblrSearch.class,

		ecologylab.semantics.generated.library.search.YahooGeoCode.class,

		ecologylab.semantics.generated.library.search.YahooGeoCodeResult.class,

		ecologylab.semantics.generated.library.search.YahooResult.class,

		ecologylab.semantics.generated.library.search.YahooResultSet.class,

		ecologylab.semantics.generated.library.search.YahooThumbnail.class,

		ecologylab.semantics.generated.library.slashdot.SlashdotArticle.class,

		ecologylab.semantics.generated.library.slashdot.SlashdotItem.class,

		ecologylab.semantics.generated.library.slashdot.SlashdotRss.class,

		ecologylab.semantics.generated.library.tumblr.Tumblr.class,

		ecologylab.semantics.generated.library.tvShow.TvShow.class,

		ecologylab.semantics.generated.library.tvShow.TvShowEpisode.class,

		ecologylab.semantics.generated.library.urbanspoon.UrbanSpoonSearch.class,

		ecologylab.semantics.generated.library.uva.DocumentSet.class,

		ecologylab.semantics.generated.library.uva.KeywordSet.class,

		ecologylab.semantics.generated.library.uva.Topic.class,

		ecologylab.semantics.generated.library.uva.TopicCluster.class,

		ecologylab.semantics.generated.library.uva.UvaModel.class,

		ecologylab.semantics.generated.library.video.Video.class,

		ecologylab.semantics.generated.library.wikipedia.Paragraph.class,

		ecologylab.semantics.generated.library.wikipedia.Section.class,

		ecologylab.semantics.generated.library.wikipedia.WikipediaCategoryType.class,

		ecologylab.semantics.generated.library.wikipedia.WikipediaMobilePage.class,

		ecologylab.semantics.generated.library.wikipedia.WikipediaPage.class,

		ecologylab.semantics.generated.library.wikipedia.WikipediaPageType.class,

	};

	public static SimplTypesScope get()
	{
		return SimplTypesScope.get(SemanticsNames.REPOSITORY_METADATA_TYPE_SCOPE, MetadataBuiltinsTypesScope.get(), TRANSLATIONS);
	}

}
