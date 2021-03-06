//
// YoutubeVideoGrid.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.VideoNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.VideoNS 
{
	[SimplInherit]
	public class YoutubeVideoGrid : CompoundDocument
	{
		[SimplCollection("youtube_video")]
		[MmName("videos")]
		private List<YoutubeVideo> videos;

		[SimplCollection("youtube_channel")]
		[MmName("featured_channels")]
		private List<YoutubeChannel> featuredChannels;

		[SimplCollection("youtube_channel")]
		[MmName("related_channels")]
		private List<YoutubeChannel> relatedChannels;

		public YoutubeVideoGrid()
		{ }

		public YoutubeVideoGrid(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<YoutubeVideo> Videos
		{
			get{return videos;}
			set
			{
				if (this.videos != value)
				{
					this.videos = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<YoutubeChannel> FeaturedChannels
		{
			get{return featuredChannels;}
			set
			{
				if (this.featuredChannels != value)
				{
					this.featuredChannels = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<YoutubeChannel> RelatedChannels
		{
			get{return relatedChannels;}
			set
			{
				if (this.relatedChannels != value)
				{
					this.relatedChannels = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
