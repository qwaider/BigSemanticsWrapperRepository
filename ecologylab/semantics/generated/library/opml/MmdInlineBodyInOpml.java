package ecologylab.semantics.generated.library.opml;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.generated.library.opml.MmdInlineOutlineInOutlineInMmdInlineBodyInOpml;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  MmdInlineBodyInOpml.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/22/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineBodyInOpml extends Metadata
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("outline") @mm_name("outline")	private List<MmdInlineOutlineInOutlineInMmdInlineBodyInOpml> outline;

	public MmdInlineBodyInOpml()
	{ }

	public MmdInlineBodyInOpml(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<MmdInlineOutlineInOutlineInMmdInlineBodyInOpml> getOutline()
	{
		return outline;
	}

	public void setOutline(List<MmdInlineOutlineInOutlineInMmdInlineBodyInOpml> outline)
	{
		this.outline = outline;
	}
}
