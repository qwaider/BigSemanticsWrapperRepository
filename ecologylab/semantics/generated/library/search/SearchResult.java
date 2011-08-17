package ecologylab.semantics.generated.library.search;

import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.generated.library.Tag;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  SearchResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/17/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * 
 */ 
@simpl_inherit
public class SearchResult extends Metadata
{
	/** 
	 * The heading of search result
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataString heading;

	/** 
	 * The snippet of search result
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataString snippet;

	/** 
	 * The link of the search result
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL link;

	/** 
	 * Alternate link in search results
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL linkOther;

	/** 
	 * The search engine used for this result
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataString engine;

	/** 
	 * The author of this item
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataString author;

	/** 
	 * Associated tags from the search engine, if exist
	 */ 
	@simpl_collection("tag")	@mm_name("tags")
	private List<Tag> tags;

	public SearchResult()
	{ }

	public SearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	heading()
	{
		MetadataString	result = this.heading;
		if (result == null)
		{
			result = new MetadataString();
			this.heading = result;
		}
		return result;
	}

	public String getHeading()
	{
		return this.heading == null ? null : heading().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getHeadingMetadata()
	{
		return heading;
	}

	public void setHeading(String heading)
	{
		if (heading != null)
			this.heading().setValue(heading);
	}

	public void setHeadingMetadata(ecologylab.semantics.metadata.scalar.MetadataString heading)
	{
		this.heading = heading;
	}

	public MetadataString	snippet()
	{
		MetadataString	result = this.snippet;
		if (result == null)
		{
			result = new MetadataString();
			this.snippet = result;
		}
		return result;
	}

	public String getSnippet()
	{
		return this.snippet == null ? null : snippet().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getSnippetMetadata()
	{
		return snippet;
	}

	public void setSnippet(String snippet)
	{
		if (snippet != null)
			this.snippet().setValue(snippet);
	}

	public void setSnippetMetadata(ecologylab.semantics.metadata.scalar.MetadataString snippet)
	{
		this.snippet = snippet;
	}

	public MetadataParsedURL	link()
	{
		MetadataParsedURL	result = this.link;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.link = result;
		}
		return result;
	}

	public ParsedURL getLink()
	{
		return this.link == null ? null : link().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getLinkMetadata()
	{
		return link;
	}

	public void setLink(ParsedURL link)
	{
		if (link != null)
			this.link().setValue(link);
	}

	public void setLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL link)
	{
		this.link = link;
	}

	public MetadataParsedURL	linkOther()
	{
		MetadataParsedURL	result = this.linkOther;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.linkOther = result;
		}
		return result;
	}

	public ParsedURL getLinkOther()
	{
		return this.linkOther == null ? null : linkOther().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getLinkOtherMetadata()
	{
		return linkOther;
	}

	public void setLinkOther(ParsedURL linkOther)
	{
		if (linkOther != null)
			this.linkOther().setValue(linkOther);
	}

	public void setLinkOtherMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL linkOther)
	{
		this.linkOther = linkOther;
	}

	public MetadataString	engine()
	{
		MetadataString	result = this.engine;
		if (result == null)
		{
			result = new MetadataString();
			this.engine = result;
		}
		return result;
	}

	public String getEngine()
	{
		return this.engine == null ? null : engine().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getEngineMetadata()
	{
		return engine;
	}

	public void setEngine(String engine)
	{
		if (engine != null)
			this.engine().setValue(engine);
	}

	public void setEngineMetadata(ecologylab.semantics.metadata.scalar.MetadataString engine)
	{
		this.engine = engine;
	}

	public MetadataString	author()
	{
		MetadataString	result = this.author;
		if (result == null)
		{
			result = new MetadataString();
			this.author = result;
		}
		return result;
	}

	public String getAuthor()
	{
		return this.author == null ? null : author().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAuthorMetadata()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		if (author != null)
			this.author().setValue(author);
	}

	public void setAuthorMetadata(ecologylab.semantics.metadata.scalar.MetadataString author)
	{
		this.author = author;
	}

	public List<Tag> getTags()
	{
		return tags;
	}

	public void setTags(List<Tag> tags)
	{
		this.tags = tags;
	}
}
